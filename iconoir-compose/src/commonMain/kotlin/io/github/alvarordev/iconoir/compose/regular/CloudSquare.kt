// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/cloud-square.svg. Do not edit.
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

public val Iconoir.Regular.CloudSquare: ImageVector
    get() = cloudsquareVector.value

private object cloudsquareVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/cloud-square", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
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
                PathNode.MoveTo(12f, 8f),
                PathNode.CurveTo(8.72727f, 8f, 8.72727f, 10f, 8.72727f, 11f),
                PathNode.CurveTo(7.81818f, 11f, 6f, 11.5f, 6f, 13.5f),
                PathNode.CurveTo(6f, 15.5f, 7.81818f, 16f, 8.72727f, 16f),
                PathNode.HorizontalTo(15.2727f),
                PathNode.CurveTo(16.1818f, 16f, 18f, 15.5f, 18f, 13.5f),
                PathNode.CurveTo(18f, 11.5f, 16.1818f, 11f, 15.2727f, 11f),
                PathNode.CurveTo(15.2727f, 10f, 15.2727f, 8f, 12f, 8f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.NonZero,
            fill = null,
            stroke = SolidColor(Color.Black),
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
