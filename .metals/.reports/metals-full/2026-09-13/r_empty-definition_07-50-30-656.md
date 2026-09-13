error id: file://<WORKSPACE>/src/main/scala/regfile/Alu.scala:
file://<WORKSPACE>/src/main/scala/regfile/Alu.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3.
	 -chisel3#
	 -chisel3().
	 -scala/Predef.
	 -scala/Predef#
	 -scala/Predef().
offset: 423
uri: file://<WORKSPACE>/src/main/scala/regfile/Alu.scala
text:
```scala
package regfile

import chisel3._


class Alu extends Module{
    val io = IO (new Bundle {
        val alucontrol = Input(UInt(5.W))

        val InA = Input(UInt(32.W))
        val InB = Input(UInt(32.W))
        val Output = Output(UInt(32.W))
        val Branch = Output(Bool())
       
        
  })

  Branch := 0.B

  when(alucontrol === "b00000".U){
    io.Output := InA + InB
  }.elsewhen(alucontrol === "b00001".U@@){
    io.Output := InA << InB[4,0]  
  }.elsewhen(alucontrol === )






    when(Output ==== 00000001.U & AluControl[4,3]=== 2)
        Branch: = 1.B
    elsewhen{
        Branch :=0.B)
    }
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 