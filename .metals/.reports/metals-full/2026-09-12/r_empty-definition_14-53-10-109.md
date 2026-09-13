error id: file://<WORKSPACE>/src/main/scala/regfile/AluControl.scala:regfile/`<error: <none>>`.
file://<WORKSPACE>/src/main/scala/regfile/AluControl.scala
empty definition using pc, found symbol in pc: 
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -chisel3/chisel3.
	 -chisel3.
	 -scala/Predef.chisel3.
offset: 24
uri: file://<WORKSPACE>/src/main/scala/regfile/AluControl.scala
text:
```scala
package regfile

import @@chisel3._

class AluControl extends Module {
  val io = IO(new Bundle {
        val aluOp = Input(UInt(3.W))
        val funct3 = Input(UInt(3.W))
	    val funct7 = Input(Bool())
	    val out = Output(UInt(5.W))
	})

	io.out := 0.U
	when (io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b000".U){	//Add
		io.out := "b00000".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b000".U){//Addi
		io.out := "b00000".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b001".U){//SLL
		io.out := "b00001".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b001".U){//SLLi
		io.out := "b00001".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b010".U){//SLT
		io.out := "b00010".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b010".U){//SLTi
		io.out := "b00010".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b000".U){//BEQ
		io.out := "b10010".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b101".U){//BGE
		io.out := "b10101".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b100".U){//XOR
		io.out := "b00100".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b100".U){//XORi
		io.out := "b00100".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b101".U){//SRL
		io.out := "b00101".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b101".U){//SRLi
		io.out := "b00101".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b110".U){//OR
		io.out := "b00110".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b110".U){//ORi
		io.out := "b00110".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b111".U){//AND
		io.out := "b00111".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b001".U){//ANDi
		io.out := "b00111".U
	}.elsewhen(io.aluOp === "b000".U && io.funct7 && io.funct3 === "b000".U){//SUB
		io.out := "b00000".U
	}.elsewhen(io.aluOp === "b000".U && io.funct7 && io.funct3 === "b000".U){//SRA
		io.out := "b00101".U
	}.elsewhen(io.aluOp === "b001".U && io.funct7 && io.funct3 === "b001".U){//SRAi
		io.out := "b00101".U
	}.elsewhen(io.aluOp === "b000".U && !io.funct7 && io.funct3 === "b000".U){//SLTU
		io.out := "b00011".U
	}.elsewhen(io.aluOp === "b001".U && !io.funct7 && io.funct3 === "b001".U){//SLTUi
		io.out := "b00011".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b010".U){//BLTU
		io.out := "b10110".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b010".U){//BGEU
		io.out := "b10111".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b010".U){//BNE
		io.out := "b10001".U
	}.elsewhen(io.aluOp === "b010".U && !io.funct7 && io.funct3 === "b010".U){//BLT
		io.out := "b10100".U
	}.elsewhen(io.aluOp === "b011".U && !io.funct7 && io.funct3 === "b011".U){//JAL
		io.out := "b11111".U
	}.elsewhen(io.aluOp === "b011".U && !io.funct7 && io.funct3 === "b011".U){//JALR
		io.out := "b11111".U
	}.otherwise {
		io.out := 0.U
	}
}
```


#### Short summary: 

empty definition using pc, found symbol in pc: 