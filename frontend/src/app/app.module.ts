import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';

import {AppComponent} from './app.component';
import {InventoryComponent} from './inventory/inventory.component';

@NgModule({
    declarations: [
        AppComponent,
        InventoryComponent,
    ],
    imports: [
        BrowserModule,
        HttpClientModule,
    ],
    providers: [],
    bootstrap: [AppComponent]
})
export class AppModule {
}
