package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation

    private int totalAdded;

    private SortedIntList sortedIntList = new SortedIntList();

    /**
     *
     * @return true if the list is changed as a result of the call
     */
    public int getTotalAdded(){
        return totalAdded;
    }    

    /**
     * Adds the specified int to the list.
     * And keeps count of the number of attempted element insertions
     *
     * @param num an integer to be added to the list
     * @return true if the list is changed as a result of the call
     */
    public boolean add(int num){
        totalAdded++;
        return sortedIntList.add(num);
    }

    /**
     * Adds all of the elements of the IntegerList to the list.
     * And keeps count of the number of attempted element insertions.
     *
     * @param list IntegerList containing elements to be added to the list
     * @return true if the list changed as a result of the call
     */
    public boolean addAll(IntegerList list){
        totalAdded += list.size();
        return sortedIntList.addAll(list);
    }

    /**
     * Returns the integer at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     */
    public int get(int index){
        return sortedIntList.get(index);
    }

    /**
     * Removes the first occurrence of the specified element from the list,
     * if it is present (optional operation).
     *
     * @param num an integer to be removed from the list, if present
     * @return true if an element was removed as a result of this call
     */
    public boolean remove(int num){
        return sortedIntList.remove(num);
    }

    /**
     * Removes from the list all of its elements that are contained in the
     * specified IntegerList.
     *
     * @param list IntegerList containing elements to be removed from
     * the list
     * @return true if the list changed as a result of the call
     */
    public boolean removeAll(IntegerList list){
        return sortedIntList.removeAll(list);
    }

    /**
     * Returns the number of elements in this list. If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return number of elements in the list
     */
    public int size(){
        return sortedIntList.size();
    }

}