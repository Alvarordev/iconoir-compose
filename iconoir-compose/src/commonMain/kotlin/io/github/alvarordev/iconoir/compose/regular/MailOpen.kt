// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/mail-open.svg. Do not edit.
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

public val Iconoir.Regular.MailOpen: ImageVector
    get() = mailopenVector.value

private object mailopenVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/mail-open", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(7f, 12f),
                PathNode.LineTo(12f, 15.5f),
                PathNode.LineTo(17f, 12f),
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
                PathNode.MoveTo(2f, 20f),
                PathNode.VerticalTo(9.13238f),
                PathNode.CurveTo(2f, 8.42985f, 2.3686f, 7.77884f, 2.97101f, 7.41739f),
                PathNode.LineTo(10.971f, 2.61739f),
                PathNode.CurveTo(11.6044f, 2.23738f, 12.3956f, 2.23738f, 13.029f, 2.6174f),
                PathNode.LineTo(21.029f, 7.4174f),
                PathNode.CurveTo(21.6314f, 7.77884f, 22f, 8.42985f, 22f, 9.13238f),
                PathNode.VerticalTo(20f),
                PathNode.CurveTo(22f, 21.1046f, 21.1046f, 22f, 20f, 22f),
                PathNode.HorizontalTo(4f),
                PathNode.CurveTo(2.89543f, 22f, 2f, 21.1046f, 2f, 20f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
