package Gates
import chisel3._
import javax.swing.UIManager.LookAndFeelInfo

class Half_Adder extends Module {
    val io = IO(new Bundle{

            val a = Input(Bool())
            val b = Input(Bool())
            val sum_output= Output(Bool())
            val carry_output= Output(Bool())
    })

    io.carry_output := io.a & io.b
    io.sum_output := io.a ^ io.b
}