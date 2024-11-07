package br.com.demo.controller;

import br.com.demo.model.ListExample;
import br.com.demo.model.MapExample;
import br.com.demo.model.QueueExample;
import br.com.demo.model.SetExample;

public class CollectionController {
    private ListExample listExample;
    private MapExample mapExample;
    private SetExample setExample;
    private QueueExample queueExample;

    public CollectionController() {
        listExample = new ListExample();
        mapExample = new MapExample();
        setExample = new SetExample();
        queueExample = new QueueExample();
    }

    public void displayCollections() {
        System.out.println("List: " + listExample.getList());
        System.out.println("Map: " + mapExample.getMap());
        System.out.println("Set: " + setExample.getSet());
        System.out.println("Queue: " + queueExample.getQueue());
    }
}
