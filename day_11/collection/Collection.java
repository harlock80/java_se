package day_11.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection {
public static void main(String[] args) {
	
	List<Integer> numeriList = new ArrayList<>();
	numeriList.add(9);
	numeriList.add(10);
	numeriList.add(11);
	numeriList.remove(2);
	System.out.println("ArrayList stampato con Enhance for");
	for (Integer i : numeriList) {
		System.out.println(i);
	}
	System.out.println("ArrayList stampato con for");
	for (int i = 0; i < numeriList.size(); i++) {
		System.out.println(numeriList.get(i));
	}
	System.out.println("Lista stampata con Iterator");
	Iterator iter = numeriList.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	List <String> strList = new LinkedList<>(); 
	strList.add("fantozzi");
	strList.add("Pierino");
	strList.add("Monnezza");
	strList.remove("fantozzi");
	//strList.remove(0);
	System.out.println("LinkedList stampato con Enhance for");
	for (String s : strList) {
		System.out.println(s);
	}
	System.out.println("LinkedList stampato con for");
	for (int s = 0; s < strList.size(); s++) {
		System.out.println(strList.get(s));
	}
	System.out.println("LinkeList stampata con Iterator");
	Iterator iterList = strList.iterator();
	while(iterList.hasNext()) {
		System.out.println(iterList.next());
	}
	System.out.println("LinkeList stampata con ListIterator");
	ListIterator listIter = strList.listIterator();
	while(listIter.hasNext()) {
		System.out.println(listIter.next());
	}
	Stack<String> stackPila = new Stack<>();
	stackPila.push("Anna");
	stackPila.push("Franco");
	stackPila.push("Gianni");
	String rimosso = stackPila.pop();
	System.out.println(rimosso + ": elemento rimosso");
	for(int i = 0; i < stackPila.size(); i++) {
		System.out.println(stackPila.get(i));
	}
	Set<Character> setCharacter = new HashSet<>();
	setCharacter.add('a');
	setCharacter.add('b');
	setCharacter.add('b');
	Iterator<Character> itrSet = setCharacter.iterator();
	System.out.println("HashSet stampato con iteratore");
	while(itrSet.hasNext()) {
		System.out.println(itrSet.next());
	}
	
	Set<Double> setTree = new TreeSet<>();
	setTree.add(20.5);
	setTree.add(30.1);
	setTree.add(13.6);
	Iterator<Double> itrTree = setTree.iterator();
	System.out.println("Iterator con TreeSet");
	while(itrTree.hasNext()) {
		System.out.println(itrTree.next());
	}
	LinkedHashSet<String> setLinkedHash = new LinkedHashSet<>();
	setLinkedHash.add("Ciao");
	setLinkedHash.add("a");
	setLinkedHash.add("tutti");
	setLinkedHash.add("Ciao");
	setLinkedHash.add("a");
	setLinkedHash.add("tutti");
	setLinkedHash.add("mamma");
	Iterator<String> itrLinkedHashSet = setLinkedHash.iterator();
	System.out.println("Iterator con LinkedHashSet");
	while(itrLinkedHashSet.hasNext()) {
		System.out.println(itrLinkedHashSet.next());
		}
	Map<String, String> hm = new HashMap<String, String>();
	hm.put("Cf4", "Paolo Rossi");
	hm.put("Cf1", "Edoardo Gialli");
	hm.put("Cf2", "Mario Bianchi");
	hm.put("Cf3", "Ernesto Verdi");
	// 
	System.out.println("scansione tramite enhanced for sull' insieme delle chiavi");
	Set<String> keySet = hm.keySet();
	for(String chiave : keySet) {
		String value = hm.get(chiave);
		System.out.println(chiave + " : " + value);
	}
	TreeMap<String, String> tm1 = new TreeMap<String, String>();
	tm1.put("Cf4", "Paolo Rossi");
	tm1.put("Cf1", "Edoardo Gialli");
	tm1.put("Cf2", "Mario Bianchi");
	tm1.put("Cf3", "Ernesto Verdi");
	// 
	System.out.println("scansione tramite enhanced for sull' insieme delle chiavi");
	Set<String> keySetTree = tm1.keySet();
	for(String chiave : keySetTree) {
		String value = tm1.get(chiave);
		System.out.println(chiave + " : " + value);
	}
}

}
