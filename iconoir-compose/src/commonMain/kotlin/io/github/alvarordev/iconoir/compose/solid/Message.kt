// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/message.svg. Do not edit.
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

public val Iconoir.Solid.Message: ImageVector
    get() = messageVector.value

private object messageVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/message", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(2.25f, 5f),
                PathNode.CurveTo(2.25f, 3.48122f, 3.48122f, 2.25f, 5f, 2.25f),
                PathNode.HorizontalTo(19f),
                PathNode.CurveTo(20.5188f, 2.25f, 21.75f, 3.48122f, 21.75f, 5f),
                PathNode.VerticalTo(15f),
                PathNode.CurveTo(21.75f, 16.5188f, 20.5188f, 17.75f, 19f, 17.75f),
                PathNode.HorizontalTo(7.96125f),
                PathNode.CurveTo(7.58154f, 17.75f, 7.2224f, 17.9226f, 6.98516f, 18.2191f),
                PathNode.LineTo(4.65418f, 21.1328f),
                PathNode.CurveTo(3.85702f, 22.1293f, 2.25f, 21.5657f, 2.25f, 20.2895f),
                PathNode.VerticalTo(5f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
