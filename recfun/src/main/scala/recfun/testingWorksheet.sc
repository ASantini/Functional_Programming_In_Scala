package recfun

object testingWorksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
      def pascal(c: Int, r: Int): Int = {
      	def getRow(r: Int, row: List[Int]): List[Int] =
        	if(r == row.size - 1) row
        	else getRow(r, nextRow(row, List(1)))
        
      	def nextRow(row: List[Int], acc: List[Int]) : List[Int]=
          if(row.isEmpty) acc
          else nextRow(row.tail, acc ::: nextElement(row))
        
      	def nextElement(row: List[Int]) : List[Int] =
        	if (row.tail.isEmpty) List(1)
        	else List(row.head + row.tail.head)
        getRow(r, List(1))(c)
    }                                             //> pascal: (c: Int, r: Int)Int
    
    pascal(3,6)                                   //> res0: Int = 20
}