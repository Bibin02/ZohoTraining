import { module, test } from 'qunit';
import { setupRenderingTest } from 'ember-js-training-zoho/tests/helpers';
import { render } from '@ember/test-helpers';
import { hbs } from 'ember-cli-htmlbars';

module('Integration | Component | home-page', function (hooks) {
  setupRenderingTest(hooks);

  test('it renders', async function (assert) {
    // Set any properties with this.set('myProperty', 'value');
    // Handle any actions with this.set('myAction', function(val) { ... });

    await render(hbs`<HomePage />`);

    assert.dom().hasText('');

    // Template block usage:
    await render(hbs`
      <HomePage>
        template block text
      </HomePage>
    `);

    assert.dom().hasText('template block text');
  });
});
