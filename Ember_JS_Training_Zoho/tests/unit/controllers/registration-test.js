import { module, test } from 'qunit';
import { setupTest } from 'ember-js-training-zoho/tests/helpers';

module('Unit | Controller | registration', function (hooks) {
  setupTest(hooks);

  // TODO: Replace this with your real tests.
  test('it exists', function (assert) {
    let controller = this.owner.lookup('controller:registration');
    assert.ok(controller);
  });
});
