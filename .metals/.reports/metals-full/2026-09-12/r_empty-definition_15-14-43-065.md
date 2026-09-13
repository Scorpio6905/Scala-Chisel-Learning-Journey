error id: file://<WORKSPACE>/src/main/scala/regfile/Control.scala:`<error>`#`<error>`.
file://<WORKSPACE>/src/main/scala/regfile/Control.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/Output.
	 -chisel3/Output#
	 -chisel3/Output().
	 -Output.
	 -Output#
	 -Output().
	 -scala/Predef.Output.
	 -scala/Predef.Output#
	 -scala/Predef.Output().
offset: 240
uri: file://<WORKSPACE>/src/main/scala/regfile/Control.scala
text:
```scala
package regfile

import chisel3._

class Control extends Module{
    val io = IO (new Bundle {
        val opcode = Input(UInt(7.W))

          val MemWrite = Output(Bool())
        val BranchOut = Output(Bool())
        val MemRead = Outpu@@t(Bool())
        val RegWrite = Output(Bool())
        val MemtoReg = Output(Bool())
        val ALUOP = Output(UInt(3.W))
        val operandAsel = Output(UInt(2.W))
        val operandBsel = Output(Bool())
        val extend_sel = Output(UInt(2.W))
        val next_PC_sel = Output(UInt(2.W))   
        
  })

    val TypeDecode = Module(new InstructionDecode)
    val ControlDecode = Module(new ControlDecode)


}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 