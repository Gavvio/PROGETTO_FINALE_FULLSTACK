import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { ArticlesService } from '../articles/articles.service';
import { ArticoloPayload } from 'src/app/utils/interfacce';
@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.scss']
})
export class DetailsComponent implements OnInit{
  articolo!:ArticoloPayload;
  constructor(private ar:ActivatedRoute,private ars:ArticlesService,private router:Router,private route:ActivatedRoute){
  }
  ngOnInit(): void {
    this.route.paramMap.subscribe(param=>{
      let id:string=<string>param.get('id');
      this.ars.loadArticoloById(Number(id)).subscribe(data => {
        this.articolo=data;
        console.log(this.articolo)
       })
    })
    let id:string=this.ar.snapshot.params['id'];

  }
}
