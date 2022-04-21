package canvas
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.CanvasRenderingContext2D

def drawGrid(canvas: HTMLCanvasElement): Unit = {
  val context = canvas
    .getContext("2d")
    .asInstanceOf[CanvasRenderingContext2D]

  context.strokeStyle = "#00ff00"
  context.fillStyle = "#009900"

  for (x <- 0 to canvas.width by 10) {
    context.beginPath()
    context.moveTo(x, 0)
    context.lineTo(x, canvas.height)
    context.lineWidth = if (x % 50 == 0) then 0.5 else 0.25
    if (x % 50 == 0) then context.fillText(x.toString, x, 10)
    context.stroke()
  }

  for (y <- 0 to canvas.height by 10) {
    context.beginPath()
    context.moveTo(0, y)
    context.lineTo(canvas.width, y)
    context.lineWidth = if (y % 50 == 0) then 0.5 else 0.25
    if (y % 50 == 0) then context.fillText(y.toString, 0, y + 10)
    context.stroke()
  }
}
