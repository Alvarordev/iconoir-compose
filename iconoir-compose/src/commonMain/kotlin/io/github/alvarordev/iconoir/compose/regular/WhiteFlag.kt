// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/white-flag.svg. Do not edit.
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

public val Iconoir.Regular.WhiteFlag: ImageVector
    get() = whiteflagVector.value

private object whiteflagVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/white-flag", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5f, 15f),
                PathNode.LineTo(5.95039f, 4.54568f),
                PathNode.CurveTo(5.97849f, 4.23663f, 6.23761f, 4f, 6.54793f, 4f),
                PathNode.HorizontalTo(20.343f),
                PathNode.CurveTo(20.6958f, 4f, 20.9725f, 4.30295f, 20.9405f, 4.65432f),
                PathNode.LineTo(20.0496f, 14.4543f),
                PathNode.CurveTo(20.0215f, 14.7634f, 19.7624f, 15f, 19.4521f, 15f),
                PathNode.HorizontalTo(5f),
                PathNode.Close,
                PathNode.MoveTo(5f, 15f),
                PathNode.LineTo(4.4f, 21f),
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
