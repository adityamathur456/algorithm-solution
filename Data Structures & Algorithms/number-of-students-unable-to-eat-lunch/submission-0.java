

public class Solution {

    public int countStudents(int[] students, int[] sandwiches) {
            int n = students.length;

                    Queue<Integer> queue = new LinkedList<>();

                            // Add all students to queue
                                    for (int student : students) {
                                                queue.offer(student);
                                                        }

                                                                int remaining = n;

                                                                        // Process each sandwich
                                                                                for (int sandwich : sandwiches) {
                                                                                            int count = 0;

                                                                                                        // Rotate queue until matching student is found
                                                                                                                    while (count < n && queue.peek() != sandwich) {
                                                                                                                                    queue.offer(queue.poll());
                                                                                                                                                    count++;
                                                                                                                                                                }

                                                                                                                                                                            // If match found
                                                                                                                                                                                        if (queue.peek() == sandwich) {
                                                                                                                                                                                                        queue.poll();
                                                                                                                                                                                                                        remaining--;
                                                                                                                                                                                                                                    } else {
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                return remaining;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    }