import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorldwideMetricsComponent } from './worldwide-metrics.component';

describe('WorldwideMetricsComponent', () => {
  let component: WorldwideMetricsComponent;
  let fixture: ComponentFixture<WorldwideMetricsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [WorldwideMetricsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(WorldwideMetricsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
