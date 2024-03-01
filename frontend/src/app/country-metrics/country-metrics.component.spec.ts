import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryMetricsComponent } from './country-metrics.component';

describe('CountryMetricsComponent', () => {
  let component: CountryMetricsComponent;
  let fixture: ComponentFixture<CountryMetricsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CountryMetricsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CountryMetricsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
