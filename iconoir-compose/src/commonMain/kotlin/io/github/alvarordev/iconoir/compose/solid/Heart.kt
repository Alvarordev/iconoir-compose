// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/heart.svg. Do not edit.
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

public val Iconoir.Solid.Heart: ImageVector
    get() = heartVector.value

private object heartVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/heart", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.9999f, 3.94228f),
                PathNode.CurveTo(13.1757f, 2.85872f, 14.7069f, 2.25f, 16.3053f, 2.25f),
                PathNode.CurveTo(18.0313f, 2.25f, 19.679f, 2.95977f, 20.8854f, 4.21074f),
                PathNode.CurveTo(22.0832f, 5.45181f, 22.75f, 7.1248f, 22.75f, 8.86222f),
                PathNode.CurveTo(22.75f, 10.5997f, 22.0831f, 12.2728f, 20.8854f, 13.5137f),
                PathNode.CurveTo(20.089f, 14.3393f, 19.2938f, 15.1836f, 18.4945f, 16.0323f),
                PathNode.CurveTo(16.871f, 17.7562f, 15.2301f, 19.4985f, 13.5256f, 21.14f),
                PathNode.LineTo(13.5216f, 21.1438f),
                PathNode.CurveTo(12.6426f, 21.9779f, 11.2505f, 21.9476f, 10.409f, 21.0754f),
                PathNode.LineTo(3.11399f, 13.5136f),
                PathNode.CurveTo(0.62867f, 10.9374f, 0.62867f, 6.78707f, 3.11399f, 4.21085f),
                PathNode.CurveTo(5.54605f, 1.68984f, 9.46239f, 1.60032f, 11.9999f, 3.94228f),
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
