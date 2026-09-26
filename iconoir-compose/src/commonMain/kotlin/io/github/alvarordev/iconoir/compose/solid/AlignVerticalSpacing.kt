// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/align-vertical-spacing.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Solid.AlignVerticalSpacing: ImageVector
    get() = alignverticalspacingVector.value

private object alignverticalspacingVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/align-vertical-spacing", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(22f, 3f),
                PathNode.LineTo(2f, 3f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(22f, 21f),
                PathNode.LineTo(2f, 21f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(8f, 15f),
                PathNode.VerticalTo(9f),
                PathNode.CurveTo(8f, 7.89543f, 8.89543f, 7f, 10f, 7f),
                PathNode.HorizontalTo(14f),
                PathNode.CurveTo(15.1046f, 7f, 16f, 7.89543f, 16f, 9f),
                PathNode.VerticalTo(15f),
                PathNode.CurveTo(16f, 16.1046f, 15.1046f, 17f, 14f, 17f),
                PathNode.HorizontalTo(10f),
                PathNode.CurveTo(8.89543f, 17f, 8f, 16.1046f, 8f, 15f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = SolidColor(Color.Black),
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
