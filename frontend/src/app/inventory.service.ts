import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({providedIn: 'root'})
export class InventoryService {

    constructor(private http: HttpClient) {
    }

    getAll(): Observable<any> {
        return this.http.get('http://127.0.0.1:8080/items');
    }
}
