// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/male.svg. Do not edit.
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

public val Iconoir.Regular.Male: ImageVector
    get() = maleVector.value

private object maleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/male", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(14.2323f, 9.74707f),
                PathNode.CurveTo(13.1474f, 8.66733f, 11.6516f, 8f, 10f, 8f),
                PathNode.CurveTo(6.68629f, 8f, 4f, 10.6863f, 4f, 14f),
                PathNode.CurveTo(4f, 17.3137f, 6.68629f, 20f, 10f, 20f),
                PathNode.CurveTo(13.3137f, 20f, 16f, 17.3137f, 16f, 14f),
                PathNode.CurveTo(16f, 12.3379f, 15.3242f, 10.8337f, 14.2323f, 9.74707f),
                PathNode.Close,
                PathNode.MoveTo(14.2323f, 9.74707f),
                PathNode.LineTo(20f, 4f),
                PathNode.MoveTo(20f, 4f),
                PathNode.HorizontalTo(16f),
                PathNode.MoveTo(20f, 4f),
                PathNode.VerticalTo(8f),
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
