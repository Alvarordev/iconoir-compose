// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/home-simple.svg. Do not edit.
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

public val Iconoir.Regular.HomeSimple: ImageVector
    get() = homesimpleVector.value

private object homesimpleVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/home-simple", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(17f, 21f),
                PathNode.HorizontalTo(7f),
                PathNode.CurveTo(4.79086f, 21f, 3f, 19.2091f, 3f, 17f),
                PathNode.VerticalTo(10.7076f),
                PathNode.CurveTo(3f, 9.30887f, 3.73061f, 8.01175f, 4.92679f, 7.28679f),
                PathNode.LineTo(9.92679f, 4.25649f),
                PathNode.CurveTo(11.2011f, 3.48421f, 12.7989f, 3.48421f, 14.0732f, 4.25649f),
                PathNode.LineTo(19.0732f, 7.28679f),
                PathNode.CurveTo(20.2694f, 8.01175f, 21f, 9.30887f, 21f, 10.7076f),
                PathNode.VerticalTo(17f),
                PathNode.CurveTo(21f, 19.2091f, 19.2091f, 21f, 17f, 21f),
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
                PathNode.MoveTo(9f, 17f),
                PathNode.HorizontalTo(15f),
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
