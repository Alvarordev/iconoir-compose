// Generated from Iconoir v7.12.1 (d7dfa4d0341df0670bfed9fc24221c9d7ef2112e), icons/regular/pentagon.svg. Do not edit.
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

public val Iconoir.Regular.Pentagon: ImageVector
    get() = pentagonVector.value

private object pentagonVector {
    val value: ImageVector by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
        ImageVector.Builder(name = "regular/pentagon", defaultWidth = 24.dp, defaultHeight = 24.dp, viewportWidth = 24f, viewportHeight = 24f).apply {
        addPath(
            pathData = listOf(
                PathNode.MoveTo(11.6473f, 2.25623f),
                PathNode.CurveTo(11.8576f, 2.10344f, 12.1424f, 2.10344f, 12.3527f, 2.25623f),
                PathNode.LineTo(22.1089f, 9.34458f),
                PathNode.CurveTo(22.3192f, 9.49737f, 22.4072f, 9.76819f, 22.3269f, 10.0154f),
                PathNode.LineTo(18.6003f, 21.4846f),
                PathNode.CurveTo(18.52f, 21.7318f, 18.2896f, 21.8992f, 18.0297f, 21.8992f),
                PathNode.HorizontalTo(5.97029f),
                PathNode.CurveTo(5.71035f, 21.8992f, 5.47998f, 21.7318f, 5.39965f, 21.4846f),
                PathNode.LineTo(1.67309f, 10.0154f),
                PathNode.CurveTo(1.59276f, 9.76819f, 1.68076f, 9.49737f, 1.89105f, 9.34458f),
                PathNode.LineTo(11.6473f, 2.25623f),
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
        }.build()
    }
}
