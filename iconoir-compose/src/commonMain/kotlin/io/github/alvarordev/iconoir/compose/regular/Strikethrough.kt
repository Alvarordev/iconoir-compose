// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/strikethrough.svg. Do not edit.
package io.github.alvarordev.iconoir.compose.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import io.github.alvarordev.iconoir.compose.Iconoir

public val Iconoir.Regular.Strikethrough: ImageVector
    get() = strikethroughVector.value

private object strikethroughVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/strikethrough", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 12f),
                PathNode.LineTo(21f, 12f),
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
                PathNode.MoveTo(16.2857f, 3f),
                PathNode.LineTo(10.068f, 3f),
                PathNode.CurveTo(7.82129f, 3f, 6f, 4.82129f, 6f, 7.06797f),
                PathNode.CurveTo(6f, 8.81895f, 7.12044f, 10.3735f, 8.78157f, 10.9272f),
                PathNode.LineTo(12f, 12f),
                PathNode.MoveTo(6f, 21f),
                PathNode.HorizontalTo(13.932f),
                PathNode.CurveTo(16.1787f, 21f, 18f, 19.1787f, 18f, 16.932f),
                PathNode.CurveTo(18f, 16.2409f, 17.8255f, 15.5804f, 17.512f, 15f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
