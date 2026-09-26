// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/hexagon-plus.svg. Do not edit.
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

public val Iconoir.Regular.HexagonPlus: ImageVector
    get() = hexagonplusVector.value

private object hexagonplusVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/hexagon-plus", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(9f, 12f),
                PathNode.HorizontalTo(12f),
                PathNode.MoveTo(15f, 12f),
                PathNode.HorizontalTo(12f),
                PathNode.MoveTo(12f, 12f),
                PathNode.VerticalTo(9f),
                PathNode.MoveTo(12f, 12f),
                PathNode.VerticalTo(15f),
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
                PathNode.MoveTo(11.7f, 1.1732f),
                PathNode.CurveTo(11.8856f, 1.06603f, 12.1144f, 1.06603f, 12.3f, 1.17321f),
                PathNode.LineTo(21.2263f, 6.3268f),
                PathNode.CurveTo(21.4119f, 6.43397f, 21.5263f, 6.63205f, 21.5263f, 6.84641f),
                PathNode.VerticalTo(17.1536f),
                PathNode.CurveTo(21.5263f, 17.3679f, 21.4119f, 17.566f, 21.2263f, 17.6732f),
                PathNode.LineTo(12.3f, 22.8268f),
                PathNode.CurveTo(12.1144f, 22.934f, 11.8856f, 22.934f, 11.7f, 22.8268f),
                PathNode.LineTo(2.77372f, 17.6732f),
                PathNode.CurveTo(2.58808f, 17.566f, 2.47372f, 17.3679f, 2.47372f, 17.1536f),
                PathNode.VerticalTo(6.84641f),
                PathNode.CurveTo(2.47372f, 6.63205f, 2.58808f, 6.43397f, 2.77372f, 6.32679f),
                PathNode.LineTo(11.7f, 1.1732f),
                PathNode.Close,
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
