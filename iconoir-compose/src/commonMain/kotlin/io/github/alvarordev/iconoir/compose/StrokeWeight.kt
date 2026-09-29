package io.github.alvarordev.iconoir.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.VectorGroup
import androidx.compose.ui.graphics.vector.VectorNode
import androidx.compose.ui.graphics.vector.VectorPath

private const val DEFAULT_STROKE_WEIGHT = 1.5f

/**
 * Returns an icon with its stroked paths scaled to [strokeWeight] on Iconoir's 24-unit viewport.
 *
 * The original icon is returned for the default weight (1.5) or when it has no stroked paths.
 * Fills, geometry, and path/group properties are preserved; filled solid icons cannot be made
 * thinner by changing a stroke. For use in a composable, prefer [rememberIconoirVector] to avoid
 * building the adjusted vector again during recomposition.
 */
public fun ImageVector.withStrokeWeight(strokeWeight: Float): ImageVector {
    require(strokeWeight.isFinite() && strokeWeight > 0f) {
        "strokeWeight must be a positive finite number"
    }
    if (strokeWeight == DEFAULT_STROKE_WEIGHT || !root.hasStroke()) return this

    val factor = strokeWeight / DEFAULT_STROKE_WEIGHT
    return ImageVector.Builder(
        name = name,
        defaultWidth = defaultWidth,
        defaultHeight = defaultHeight,
        viewportWidth = viewportWidth,
        viewportHeight = viewportHeight,
        tintColor = tintColor,
        tintBlendMode = tintBlendMode,
        autoMirror = autoMirror,
    ).apply {
        root.forEach { addScaledNode(it, factor) }
    }.build()
}

/** Remembers a weight-adjusted vector until [icon] or [strokeWeight] changes. */
@Composable
public fun rememberIconoirVector(
    icon: ImageVector,
    strokeWeight: Float = DEFAULT_STROKE_WEIGHT,
): ImageVector = remember(icon, strokeWeight) { icon.withStrokeWeight(strokeWeight) }

private fun VectorGroup.hasStroke(): Boolean = any { node ->
    when (node) {
        is VectorPath -> node.stroke != null
        is VectorGroup -> node.hasStroke()
    }
}

private fun ImageVector.Builder.addScaledNode(node: VectorNode, factor: Float) {
    when (node) {
        is VectorGroup -> {
            addGroup(
                name = node.name,
                rotate = node.rotation,
                pivotX = node.pivotX,
                pivotY = node.pivotY,
                scaleX = node.scaleX,
                scaleY = node.scaleY,
                translationX = node.translationX,
                translationY = node.translationY,
                clipPathData = node.clipPathData,
            )
            node.forEach { addScaledNode(it, factor) }
            clearGroup()
        }
        is VectorPath -> {
            val adjustedWidth = if (node.stroke != null) node.strokeLineWidth * factor else node.strokeLineWidth
            require(adjustedWidth.isFinite()) { "strokeWeight is too large for this icon" }
            addPath(
                pathData = node.pathData,
                pathFillType = node.pathFillType,
                name = node.name,
                fill = node.fill,
                fillAlpha = node.fillAlpha,
                stroke = node.stroke,
                strokeAlpha = node.strokeAlpha,
                strokeLineWidth = adjustedWidth,
                strokeLineCap = node.strokeLineCap,
                strokeLineJoin = node.strokeLineJoin,
                strokeLineMiter = node.strokeLineMiter,
                trimPathStart = node.trimPathStart,
                trimPathEnd = node.trimPathEnd,
                trimPathOffset = node.trimPathOffset,
            )
        }
    }
}
