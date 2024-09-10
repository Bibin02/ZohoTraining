import Route from '@ember/routing/route';

export default class BookTicketRoute extends Route {
  model() {
    let data = {
      arrive: 'Arrive',
      depart: 'Depart',
      doj: '',
      no_of_tickets: 1,
      Tickets: [
        {
          pid: 1,
          pname: 'Name 1',
          page: 1,
          pberth: '',
        },
      ],
    };
    return data;
  }
}
