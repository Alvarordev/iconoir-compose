// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/planet-alt.svg. Do not edit.
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

public val Iconoir.Regular.PlanetAlt: ImageVector
    get() = planetaltVector.value

private object planetaltVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/planet-alt", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(20f, 12f),
                PathNode.ArcTo(8f, 8f, 0f, true, false, 4f, 12f),
                PathNode.ArcTo(8f, 8f, 0f, true, false, 20f, 12f),
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
                PathNode.MoveTo(19.812f, 12.9893f),
                PathNode.CurveTo(21.6252f, 14.5004f, 22.5667f, 15.8535f, 22.1738f, 16.6414f),
                PathNode.CurveTo(21.4428f, 18.1075f, 16.3687f, 17.0617f, 10.8406f, 14.3054f),
                PathNode.CurveTo(5.31236f, 11.5492f, 1.42346f, 8.12624f, 2.15445f, 6.6601f),
                PathNode.CurveTo(2.54636f, 5.87405f, 4.18666f, 5.81005f, 6.47602f, 6.34458f),
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
