import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-worldwide-metrics',
  templateUrl: './worldwide-metrics.component.html',
  styleUrl: './worldwide-metrics.component.css'
})
@Injectable({
  providedIn: 'root'
})
export class WorldwideMetricsComponent implements OnInit{
  data: any[] = [];
  searchResults: any[] = [];
  filteredResults: any[] = [];
  searchTerm: string = '';
  selectedRegion: string = '';
  yearFrom: number = 0;
  yearTo: number = 0;


  constructor(private router: Router,private http: HttpClient) { }
  ngOnInit() {
    this.http.get<any[]>(`http://localhost:8080/api/stats/all`).subscribe((data) => {
      this.data = data;
      this.searchResults=data;
      this.filteredResults=data;})
  }

  search(): void {
    if(this.searchTerm.trim()===''){
      this.filter();
      return;
    }
    if(this.selectedRegion.trim()  === '' ){
      this.searchResults = this.data.filter(row => 
        Object.values(row).some((val: any) => 
          val.toString().toLowerCase().includes(this.searchTerm.toLowerCase())
        )
      );
    } else {
      this.searchResults = this.filteredResults.filter(row => 
        Object.values(row).some((val: any) => 
          val.toString().toLowerCase().includes(this.searchTerm.toLowerCase())
        )
      );
    }
    this.filteredResults = this.searchResults;
  }

  filter(): void {
    if (this.yearFrom < 1950) {
      this.yearFrom = 1950;
    }
    if(this.searchTerm.trim()===''){
      this.filteredResults = this.data.filter(row =>
        (this.selectedRegion.trim()  === '' || row.regionName === this.selectedRegion) &&
        (!this.yearFrom || row.year >= this.yearFrom) &&
        (!this.yearTo || row.year <= this.yearTo)
      );
    } else {
      this.filteredResults = this.searchResults.filter(row =>
        (this.selectedRegion.trim()  === '' || row.regionName === this.selectedRegion) &&
        (!this.yearFrom || row.year >= this.yearFrom) &&
        (!this.yearTo || row.year <= this.yearTo)
      );
    }
  }

}
