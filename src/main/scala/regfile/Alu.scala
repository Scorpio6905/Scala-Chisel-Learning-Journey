package regfile

import chisel3._


class Alu extends Module{
    val io = IO (new Bundle {
        val alucontrol = Input(UInt(5.W))

        val InA = Input(SInt(32.W))
        val InB = Input(SInt(32.W))
        val output = Output(SInt(32.W))
        val Branch = Output(Bool())         
  })
  
   //Add Addi
   when(io.alucontrol === "b00000".U)
	   {io.output := io.InA + io.InB}

	//Sll Slli 
   .elsewhen(io.alucontrol === "b00001".U)
	   {io.output := io.InA << io.InB(4,0)}

	//Xor Xori
	.elsewhen (io.alucontrol === "b00100".U)
	        {io.output := io.InA ^ io.InB}

	//Srl Srli
	.elsewhen(io.alucontrol === "b00101".U)
	        {io.output := (io.InA.asUInt >> io.InB(4,0)).asSInt}

	//Sra Srai
	.elsewhen(io.alucontrol === "b01101".U)
	        {io.output := io.InA >> io.InB(4,0)}

	//Or Ori
	.elsewhen(io.alucontrol === "b00110".U)
	        {io.output := io.InA | io.InB}

	//And Andi
	.elsewhen(io.alucontrol === "b00111".U)
	        {io.output := io.InA & io.InB}

	//Sub
	.elsewhen(io.alucontrol === "b01000".U)
	        {io.output := io.InA - io.InB}

	//Jal Jalr
	.elsewhen(io.alucontrol === "b11111".U)
	        {io.output := io.InA}

	//Bge
	.elsewhen(io.alucontrol === "b10101".U){
		when (io.InA >= io.InB)
		    {io.output := 1.S}
		.otherwise{io.output := 0.S}
    }

	//Bgeu
	.elsewhen(io.alucontrol === "b10111".U){
		when (io.InA.asUInt >= io.InB.asUInt)
		    {io.output := 1.S}
		.otherwise{io.output := 0.S}
    }

	//Sltu Sltui OR Bltu
	.elsewhen(io.alucontrol === "b00011".U || io.alucontrol === "b10110".U){
		when(io.InA.asUInt < io.InB.asUInt)
		    {io.output := 1.S}
		.otherwise {io.output := 0.S}
    }

	//Beq
	.elsewhen(io.alucontrol === "b10000".U){
		when(io.InA === io.InB)
		    {io.output := 1.S}
		.otherwise{io.output := 0.S}
    }
	//Slt Slti OR Blt
	.elsewhen(io.alucontrol === "b00010".U || io.alucontrol === "b10100".U){
		when (io.InA < io.InB)
		    {io.output := 1.S}
		.otherwise{io.output := 0.S}
    }
	//Bne
	.elsewhen(io.alucontrol === "b10001".U){
		when (io.InA =/= io.InB)
		    {io.output := 1.S}
		.otherwise{io.output := 0.S}
    }
	.otherwise{io.output := DontCare}

	//Branch
	when (io.output === 1.S && io.alucontrol(4,3) === "b10".U)
	        {io.Branch := 1.B}
	.otherwise{io.Branch := 0.B}
}