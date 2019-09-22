import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppMaterialModule } from './app-material.module';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { WelcomeModule } from './welcome/welcome.module';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    AppMaterialModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    BrowserModule,
    WelcomeModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
