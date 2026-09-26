// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/empty-page.svg. Do not edit.
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

public val Iconoir.Regular.EmptyPage: ImageVector
    get() = emptypageVector.value

private object emptypageVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/empty-page", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(4f, 21.4f),
                PathNode.VerticalTo(2.6f),
                PathNode.CurveTo(4f, 2.26863f, 4.26863f, 2f, 4.6f, 2f),
                PathNode.HorizontalTo(16.2515f),
                PathNode.CurveTo(16.4106f, 2f, 16.5632f, 2.06321f, 16.6757f, 2.17574f),
                PathNode.LineTo(19.8243f, 5.32426f),
                PathNode.CurveTo(19.9368f, 5.43679f, 20f, 5.5894f, 20f, 5.74853f),
                PathNode.VerticalTo(21.4f),
                PathNode.CurveTo(20f, 21.7314f, 19.7314f, 22f, 19.4f, 22f),
                PathNode.HorizontalTo(4.6f),
                PathNode.CurveTo(4.26863f, 22f, 4f, 21.7314f, 4f, 21.4f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(16f, 2f),
                PathNode.VerticalTo(5.4f),
                PathNode.CurveTo(16f, 5.73137f, 16.2686f, 6f, 16.6f, 6f),
                PathNode.HorizontalTo(20f),
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
