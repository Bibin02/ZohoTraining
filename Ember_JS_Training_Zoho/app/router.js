import EmberRouter from '@ember/routing/router';
import config from 'ember-js-training-zoho/config/environment';

export default class Router extends EmberRouter {
  location = config.locationType;
  rootURL = config.rootURL;
}

Router.map(function () {
  this.route('BMI', { path: 'bmi-calculator' });
  this.route('not-found', { path: '/*path' });
  this.route('home', { path: '/' });
  this.route('book-ticket');
  this.route('registration');
  this.route('social-media', function () {
    this.route('posts', { path: 'posts/:pid' });
  });
});
