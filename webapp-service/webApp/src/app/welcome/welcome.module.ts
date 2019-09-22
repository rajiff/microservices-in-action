import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WelcomeRoutingModule } from './welcome-routing.module';
import { WelcomeViewComponent } from './welcome-view/welcome-view.component';


@NgModule({
  declarations: [
    WelcomeViewComponent,
  ],
  imports: [
    CommonModule,
    WelcomeRoutingModule
  ],
  exports: [
  	WelcomeViewComponent
  ]
})
export class WelcomeModule { }
