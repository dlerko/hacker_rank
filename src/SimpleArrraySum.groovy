def reader = System.in.newReader()
int count = Integer.parseInt(reader.readLine())
def sum = 0
reader.readLine().split().each { sum += Integer.parseInt(it) }
println sum