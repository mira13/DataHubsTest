import {Component, OnInit} from '@angular/core';
import {InventoryService} from '../inventory.service';

import {Item} from './item';

@Component({
    selector: 'app-inventory',
    templateUrl: './inventory.component.html',
    styleUrls: ['./inventory.component.scss']
})
export class InventoryComponent implements OnInit {
    inventory: Item[];
    columnHeader: String[] = ['SKU', 'Item', 'Count'];

    constructor(private inventoryService: InventoryService) {
    }

    ngOnInit(): void {
        this.inventoryService.getAll().subscribe(response => {
            this.inventory = response._embedded.items;
        });
    }

}
