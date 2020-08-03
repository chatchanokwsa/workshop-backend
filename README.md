# workshop-java-01

## Circular buffer

### 1. Data structure ? (Internal)
+ Array of String

### 2. Operations/Behavior/Methods ?  user -> CB ?
+ writeData(string):void
+ readData(): string
+ isFull(): boolean
+ isEmpty(): boolean

+ setSize(int): void

### 3. Internal process ?
+ buffer size = 10 (default)
+ read pointer = 0
+ write pointer = 0

### List of test cases
* TC01 => create_new_buffer_should_empty
* TC02 => write_A_to_buffer_should_read_A
* TC03 => write_A_B_C_to_buffer_should_read_A_B_C
* TC04 => write_A_B_C_D_to_buffer_should_read_A_B_C_D
* TC05 => write_A_B_C_D_E_to_buffer_should_read_A_B_C_D_E
