error id: file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala:operandAsel.
file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/io/operandAsel.
	 -chisel3/io/operandAsel#
	 -chisel3/io/operandAsel().
	 -chisel3/util/io/operandAsel.
	 -chisel3/util/io/operandAsel#
	 -chisel3/util/io/operandAsel().
	 -io/operandAsel.
	 -io/operandAsel#
	 -io/operandAsel().
	 -scala/Predef.io.operandAsel.
	 -scala/Predef.io.operandAsel#
	 -scala/Predef.io.operandAsel().
offset: 1571
uri: file://<WORKSPACE>/src/main/scala/regfile/ControlDecode.scala
text:
```scala
import chisel3._
import chisel3.util._


class ControlDecode extends Module {
    val io = IO(new Bundle {

        val Rformat = Input(Bool())
        val load = Input(Bool())
        val Store = Input(Bool())
        val Branch = Input(Bool())
        val Itype = Input(Bool())
        val JALR = Input(Bool())
        val JAL = Input(Bool())
        val Lui = Input(Bool())

        val MemWrite = Output(Bool())
        val BranchOut = Output(Bool())
        val MemRead = Output(Bool())
        val RegWrite = Output(Bool())
        val MemtoReg = Output(Bool())
        val ALUOP = Output(UInt(3.W))
        val operandAsel = Output(UInt(2.W))
        val operandBsel = Output(Bool())
        val extend_sel = Output(UInt(2.W))
        val next_PC_sel = Output(UInt(2.W))    
  })


  when(Rformat === 1.B){
    io.RegWrite := 1.B
    io.ALUOP := "b000".U
  }.elsewhen(load === 1.B){
     io.MemRead := 1.B
     io.RegWrite := 1.B
     io.MemtoReg := 1.B
     io.ALUOP := "b100".U
     operandBsel := 1.B
  }.elsewhen(Store === 1.B){
    io.MemWrite := 1.B
    io.ALUOP := "b101".U
    io.operandBsel := 1.B
    io.extend_sel := "b10".U
  }.elsewhen(Branch === 1.B){
    io.BranchOut := 1.B
    io.ALUOP := "b010"
    io.next_PC_sel := "b01"
  }.elsewhen(Itype === 1.B){
     io.RegWrite := 1.B
     io.ALUOP := "b001".U
     io.operandBsel := 1.B
  }.elsewhen(JALR === 1.B){
    io.RegWrite := 1.B
    io.ALUOP := "b011".U
    io.operandAsel := "b10".U
    io.next_PC_sel := "b11"
  }.elsewhen(JAL === 1.B){
    io.RegWrite := 1.B
    io.ALUOP := "b011".U
    io.o@@perandAsel := "b10".U
    io.next_PC_sel := "b10"
  }.elsewhen(Lui === 1.B){
    io.RegWrite := 1.B
    io.ALUOP := "b100".U
    io.operandAsel := "b11".U
    
  }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 