package br.com.demo.view;

import br.com.demo.controller.CollectionController;

public class CollectionView {
    public static void main(String[] args) {
        CollectionController controller = new CollectionController();
        controller.displayCollections();
    }
}
