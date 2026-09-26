// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/solid/nav-arrow-up.svg. Do not edit.
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

public val Iconoir.Solid.NavArrowUp: ImageVector
    get() = navarrowupVector.value

private object navarrowupVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "solid/nav-arrow-up", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(5.30711f, 15.287f),
                PathNode.CurveTo(5.4232f, 15.5673f, 5.69668f, 15.75f, 6.00002f, 15.75f),
                PathNode.HorizontalTo(18f),
                PathNode.CurveTo(18.3034f, 15.75f, 18.5768f, 15.5673f, 18.6929f, 15.287f),
                PathNode.CurveTo(18.809f, 15.0068f, 18.7449f, 14.6842f, 18.5304f, 14.4697f),
                PathNode.LineTo(12.5304f, 8.46967f),
                PathNode.CurveTo(12.2375f, 8.17678f, 11.7626f, 8.17678f, 11.4697f, 8.46967f),
                PathNode.LineTo(5.46969f, 14.4697f),
                PathNode.CurveTo(5.25519f, 14.6842f, 5.19103f, 15.0068f, 5.30711f, 15.287f),
                PathNode.Close,
            ),
            pathFillType = PathFillType.EvenOdd,
            fill = SolidColor(Color.Black),
            stroke = null,
            strokeLineWidth = 1.5f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 4f,
        )
        }.build()
    }
}
