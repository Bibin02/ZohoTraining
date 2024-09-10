import Controller from '@ember/controller';
import { tracked } from '@glimmer/tracking';
import { action } from '@ember/object';

export default class BookTicketController extends Controller {
  @tracked isLoad = false;

  @tracked arrive = 'Arrive in Controller';
  @tracked depart = 'Depart in Controller';
  @tracked doj = '';
  @tracked no_of_tickets = 1;
  @tracked booking_type = '';

  @tracked Tickets = [];

  @action
  updateTicketsCount() {
    this.no_of_tickets = Number(event.target.value);

    if (this.no_of_tickets > 0 && this.no_of_tickets <= 5) {
      this.Tickets = [];
      for (let index = 1; index <= this.no_of_tickets; index++) {
        let per_head = {
          pid: index,
          pname: '',
          page: '',
          pberth: '',
        };
        this.Tickets.push(per_head);
      }
      // this.model.Tickets = this.Tickets;
    } else {
      this.no_of_tickets = 1;
      event.target.value = 1;
    }
  }

  @action
  loadPeople() {
    this.isLoad = !this.isLoad;
  }
}
