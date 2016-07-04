package patmat


object patmatWkst {
  val testString = Huffman.string2Chars("He")     //> testString  : List[Char] = List(H, e)
  val testTimes = Huffman.times(testString)       //> testTimes  : List[(Char, Int)] = List((e,1), (H,1))
  val testfreqs = Huffman.makeOrderedLeafList(testTimes)
                                                  //> testfreqs  : List[patmat.Huffman.Leaf] = List(Leaf(H,1))
    
    
          def insertSort(acc: List[Huffman.Leaf], remain: List[Huffman.Leaf], current: (Char,Int)): List[Huffman.Leaf] =
          remain match {
        		case List() => acc ::: List((Huffman.Leaf(current._1, current._2)))
        		case y :: ys => if(y.weight < current._2)  acc ::: Huffman.Leaf(current._1, current._2) :: y :: ys
          		else insertSort(remain.head :: acc, remain.tail, current)
      }                                           //> insertSort: (acc: List[patmat.Huffman.Leaf], remain: List[patmat.Huffman.Lea
                                                  //| f], current: (Char, Int))List[patmat.Huffman.Leaf]
      
  var testSort = insertSort(List(), List(), ('e', 1))
                                                  //> testSort  : List[patmat.Huffman.Leaf] = List(Leaf(e,1))
  var testSort2 = insertSort(List(), testSort, ('H', 1))
                                                  //> testSort2  : List[patmat.Huffman.Leaf] = List(Leaf(e,1), Leaf(H,1))
  var testSort3 = insertSort(List(), testSort2, ('L', 4))
                                                  //> testSort3  : List[patmat.Huffman.Leaf] = List(Leaf(L,4), Leaf(e,1), Leaf(H,1
                                                  //| ))
  var testSort4 = insertSort(List(), testSort3, ('a', 2))
                                                  //> testSort4  : List[patmat.Huffman.Leaf] = List(Leaf(L,4), Leaf(a,2), Leaf(e,1
                                                  //| ), Leaf(H,1))
  
  var testSort5 = insertSort(List(), testSort4, ('c', 3))
                                                  //> testSort5  : List[patmat.Huffman.Leaf] = List(Leaf(L,4), Leaf(c,3), Leaf(a,2
                                                  //| ), Leaf(e,1), Leaf(H,1))
                                                  
                                                
    Huffman.makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3)))
                                                  //> res0: List[patmat.Huffman.Leaf] = List(Leaf(x,3))
  
  
 
 
}