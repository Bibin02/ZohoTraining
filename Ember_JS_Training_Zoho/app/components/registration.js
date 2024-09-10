import Component from '@glimmer/component';
// import { action } from '@ember/object';
// import { tracked } from '@glimmer/tracking';
import { observer, set } from '@ember/object';

export default class Registration extends Component {
  /*
	@tracked name;
	@tracked regNo;
	@tracked m1 = 0;
	@tracked m2 = 0;
	@tracked total = 0;

	especially in modern versions like Ember 5.0 where observers are somewhat deprecated 
	and less frequently used. Here are some possible issues and how to troubleshoot them:

	1. Tracked Properties
	In Ember 5.0, the framework uses the tracked property system for reactivity,
	 and the default two-way bindings of older Ember versions have been replaced. 
	 If you’re using @tracked properties, observers may not detect changes as they would with the classic Ember properties.

	
	
	valueChanged1 = observer('m1', function (){
		console.log('Mark 1 is Updated..');
		// alert('Mark 1 is Updated..');
		this.updateTotal();
	});
	
	valueChanged2 = observer('m2', function (){
		console.log('Mark 2 is Updated..');
		// alert('Mark 2 is Updated..');
		this.updateTotal();
	});
	
	nameChanged = observer('name', function (){
		console.log('Name is Updated..');
		// alert('Name is Updated..');
	});
	
	regNoChanged = observer('regNo', function (){
		console.log('Reg No is Updated..');
		// alert('Reg No is Updated..');
	});
	
	@action
	updatename(){
		this.name = event.target.value;
	}
	@action
	updateReg(){
		this.regNo = event.target.value;
	}
	@action
	updateM1(){
		this.m1 = event.target.value;
	}
	@action
	updateM2(){
		this.m2 = event.target.value;
	}
	
	updateTotal(){
		this.total = this.m1 + this.m2;
	}
	*/

  name = '';
  regNo = '';
  m1 = 0;
  m2 = 0;
  total = 0;

  // Observer for m1
  valueChanged1 = observer('m1', function () {
    console.log('Mark 1 is Updated..');
    this.updateTotal();
  });

  // Observer for m2
  valueChanged2 = observer('m2', function () {
    console.log('Mark 2 is Updated..');
    this.updateTotal();
  });

  // Observer for name
  nameChanged = observer('name', function () {
    console.log('Name is Updated..');
  });

  // Observer for regNo
  regNoChanged = observer('regNo', function () {
    console.log('Reg No is Updated..');
  });

  updateTotal() {
    set(this, 'total', Number(this.m1) + Number(this.m2));
  }

  actions = {
    updateName(event) {
      set(this, 'name', event.target.value);
    },
    updateReg(event) {
      set(this, 'regNo', event.target.value);
    },
    updateM1(event) {
      set(this, 'm1', Number(event.target.value));
    },
    updateM2(event) {
      set(this, 'm2', Number(event.target.value));
    },
  };
}
