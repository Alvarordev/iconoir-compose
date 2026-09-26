// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/album.svg. Do not edit.
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

public val Iconoir.Regular.Album: ImageVector
    get() = albumVector.value

private object albumVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/album", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(3f, 20.4f),
                PathNode.VerticalTo(3.6f),
                PathNode.CurveTo(3f, 3.26863f, 3.26863f, 3f, 3.6f, 3f),
                PathNode.HorizontalTo(20.4f),
                PathNode.CurveTo(20.7314f, 3f, 21f, 3.26863f, 21f, 3.6f),
                PathNode.VerticalTo(20.4f),
                PathNode.CurveTo(21f, 20.7314f, 20.7314f, 21f, 20.4f, 21f),
                PathNode.HorizontalTo(3.6f),
                PathNode.CurveTo(3.26863f, 21f, 3f, 20.7314f, 3f, 20.4f),
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
        addPath(
            pathData = listOf(
                PathNode.MoveTo(12f, 15.5f),
                PathNode.CurveTo(12f, 16.3284f, 11.3284f, 17f, 10.5f, 17f),
                PathNode.CurveTo(9.67157f, 17f, 9f, 16.3284f, 9f, 15.5f),
                PathNode.CurveTo(9f, 14.6716f, 9.67157f, 14f, 10.5f, 14f),
                PathNode.CurveTo(11.3284f, 14f, 12f, 14.6716f, 12f, 15.5f),
                PathNode.Close,
                PathNode.MoveTo(12f, 15.5f),
                PathNode.VerticalTo(7.6f),
                PathNode.CurveTo(12f, 7.26863f, 12.2686f, 7f, 12.6f, 7f),
                PathNode.HorizontalTo(15f),
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
