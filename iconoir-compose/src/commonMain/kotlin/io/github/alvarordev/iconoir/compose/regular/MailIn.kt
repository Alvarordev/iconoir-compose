// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/mail-in.svg. Do not edit.
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

public val Iconoir.Regular.MailIn: ImageVector
    get() = mailinVector.value

private object mailinVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/mail-in", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5f, 9f),
                PathNode.LineTo(9.5f, 12f),
                PathNode.LineTo(14f, 9f),
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
                PathNode.MoveTo(17f, 19f),
                PathNode.HorizontalTo(3f),
                PathNode.CurveTo(1.89543f, 19f, 1f, 18.1046f, 1f, 17f),
                PathNode.VerticalTo(7f),
                PathNode.CurveTo(1f, 5.89543f, 1.89543f, 5f, 3f, 5f),
                PathNode.HorizontalTo(16f),
                PathNode.CurveTo(17.1046f, 5f, 18f, 5.89543f, 18f, 7f),
                PathNode.VerticalTo(9f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        addPath(
            pathData = listOf(
                PathNode.MoveTo(23f, 14f),
                PathNode.HorizontalTo(17f),
                PathNode.MoveTo(17f, 14f),
                PathNode.LineTo(20f, 11f),
                PathNode.MoveTo(17f, 14f),
                PathNode.LineTo(20f, 17f),
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
