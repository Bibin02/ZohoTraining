import { module, test } from 'qunit';
import { setupTest } from 'ember-js-training-zoho/tests/helpers';

module('Unit | Route | social-media/posts', function (hooks) {
  setupTest(hooks);

  test('it exists', function (assert) {
    let route = this.owner.lookup('route:social-media/posts');
    assert.ok(route);
  });
});
