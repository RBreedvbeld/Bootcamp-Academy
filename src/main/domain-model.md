| Class    | Members               | Methods                     | Scenario            | Output                       |
|----------|-----------------------|-----------------------------|---------------------|------------------------------|
| TodoList | Arraylist<Task> tasks | getTasks()                  |                     | print all tasks              |
|          |                       |                             |                     |                              |
|          |                       | searchTask(String taskName) |                     | return Task Object           |
|          |                       |                             | If task not in list | print message does not exist |
|          |                       | getCompletedTasks()         |                     |                              |
|          |                       | getIncompleteTasks()        |                     |                              |
|          |                       | remove(Task item)           |                     |                              |
|          |                       | sortTasksAscending()        |                     | return tasks sorted          |
|          |                       | sortTasksDescending()       |                     | return tasks sorted          |
| Task     | boolean isComplete    |                             |                     |                              |


## User Stories

1. As a student of the Academy I want to be able to add a specific item to my Learning Plan.

2. As a student of the Academy if I change my mind I want to be able to remove an item from my Learning Plan.

3. As a student of the Academy I'd like to know when my Learning plan is full, when I try to add another item (Course, Tutorial, Certification) to it.

4. As a manager at the Academy, I'd like to be able to change the capacity of Learning Plans.

5. As a student of the Academy, I'd like to know that if I try to remove an item that doesn't exist in my Learning Plan.

## Domain Model
| User stories | Members/Attributes/Fields     | Methods                         | Scenario's                                                                                      | Outcomes/Outputs                                                      |   |   |
|--------------|-------------------------------|---------------------------------|-------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|---|---|
| 1.           | ArrayList<String> planItem    | void add Item(String)           | if item is added, message (String)                                                              | print message(Item is added to your personal Learning PLan)           |   |   |
| 1.           | ArrayList<Integer> planCosts  | void add Costs(Integer)         | if item is added, message (String)                                                              | print message(These are the costs of your added Item)                 |   |   |
|              |                               |                                 | if item is already in plan, message (string)                                                    | print message (item already exist in your personal Learning Plan)     |   |   |
|              |                               |                                 | if item can not be added to the plan (String)                                                   |                                                                       |   |   |
|              |                               |                                 |                                                                                                 |                                                                       |   |   |
| 2.           | ArrayList<String> planItem    | void remove Item (String)       | if item is removed, message (String)                                                            | print message (This Item is removed from your personal Learning Plan) |   |   |
| 2.           | ArrayList<Integer> planCosts  | void remove Costs (Integer)     | if item is removed, message (String)                                                            | print message (This Costs has been removed)  update costs             |   |   |
| 2.           |                               |                                 | if item does not exist, message (String)                                                        | print message (This item can not be removed)                          |   |   |
|              |                               |                                 |                                                                                                 |                                                                       |   |   |
|              |                               | updateCapacity(int newCapacity) | if capacity is changed, change the value of capacity                                            | return true                                                           |   |   |
|              |                               |                                 |                                                                                                 | return false if attempt to change to 0 or negative number             |   |   |
|              |                               |                                 |                                                                                                 |                                                                       |   |   |
|              |                               |                                 | if updating capacity would mean that there are more items in the plan than the capacity allows. | return false and output message                                       |   |   |
