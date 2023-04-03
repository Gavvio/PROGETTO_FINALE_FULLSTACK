import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-seconda-scelta',
  templateUrl: './seconda-scelta.component.html',
  styleUrls: ['./seconda-scelta.component.scss']
})
export class SecondaSceltaComponent implements OnInit {
  path: string = "";
  constructor(private router: Router) { }

  ngOnInit() {
    if (this.router.url == "/chitarre/chitarre_elettriche") {
      this.path = "chitarre_elettriche"
    }
    else if (this.router.url == "/chitarre/chitarre_classiche") {
      this.path = "chitarre_classiche"
    }
    else if (this.router.url == "/chitarre/chitarre_acustiche") {
      this.path = "chitarre_acustiche"
    }
    else if (this.router.url == "/chitarre/amplificatori_chitarre_elettriche") {
      this.path = "amplificatori_chitarre_elettriche"
    }
    else if (this.router.url == "/chitarre/corde") {
      this.path = "chitarre_corde"
    }
    else if (this.router.url == "/chitarre/effetti") {
      this.path = "chitarre_effetti"
    }
    else if (this.router.url == "/bassi/bassi_elettrici") {
      this.path = "bassi_elettrici"
    }
    else if (this.router.url == "/bassi/bassi_acustici") {
      this.path = "bassi_acustici"
    }
    else if (this.router.url == "/bassi/corde") {
      this.path = "bassi_corde"
    }
    else if (this.router.url == "/bassi/effetti") {
      this.path = "bassi_effetti"
    }
    else if (this.router.url == "/bassi/amplificatori_bassi") {
      this.path = "bassi_amplificatori"
    }
  }

}
