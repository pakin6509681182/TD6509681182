package core;

import junit.framework.TestCase;

public class JUNITStack extends TestCase {

	public void testCreateNewEmptyStack() {
        Stack s1 = new Stack();
        int size = s1.getSize();

        assertEquals(0, size);
        boolean empty = s1.isEmpty();
        assertTrue(empty);
	}
    public void testPushElmToTop() {
        Stack s1 = new Stack();
        s1.push(1);
        int size = s1.getSize();

        assertEquals(1, size);
        boolean empty = s1.isEmpty();
        assertFalse(empty);

        Integer topElement = s1.top();
        assertEquals(Integer.valueOf(1), topElement);
    }
    /*public void testPushDifferentElmTypeToStack() {
        Stack s1 = new Stack();
        s1.push(1);
        try {
            s1.push(null);
            //fail("Expected an IllegalArgumentException to be thrown");
        } catch (IllegalArgumentException e) {
            assertEquals("All elements in the stack must be of the same type.", e.getMessage());
        }

        int size = s1.getSize();
        assertEquals(1, size);
        Integer topElement = s1.top();
        assertEquals(Integer.valueOf(1), topElement);
    }*/
    public void testLastInFirstOut() {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        Integer poppedElement = s1.pop();
        assertEquals(Integer.valueOf(3), poppedElement);

        poppedElement = s1.pop();
        assertEquals(Integer.valueOf(2), poppedElement);

        poppedElement = s1.pop();
        assertEquals(Integer.valueOf(1), poppedElement);
    }
    public void testPushToFullStack() {
        Stack s1 = new Stack(3);
        s1.push(1);
        s1.push(2);
        s1.push(3);

        try {
            s1.push(4);
            fail("Expected a PushToFullStackException to be thrown");
        } catch (PushToFullStackException e) {
            assertEquals("Stack is full. Cannot push to full stack.", e.getMessage());
        }
    }
}
