import Component from '@glimmer/component';
import { tracked } from '@glimmer/tracking';
import { action } from '@ember/object';

export default class Bmi extends Component {
  @tracked bmi = 0.0;
  @tracked weight = 0.0;
  @tracked height = 1.0;

  @action
  calculateBmi() {
    if (!(this.height < 0.01 || this.weight < 0)) {
      const h = this.height / 100; // Convert to Meters.
      this.bmi = (this.weight / (h * h)).toFixed(2);
    } else {
      this.bmi = 'Provide Proper Values.';
    }
  }
  @action
  updateWeight() {
    this.weight = event.target.value;
  }
  @action
  updateHeight() {
    this.height = event.target.value;
  }
}
