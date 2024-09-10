import Route from '@ember/routing/route';

export default class SocialMediaRoute extends Route {
    async model(){
        let response = await fetch("./api/data.json");
        let parsed = await response.json();

        return parsed;
    }
}
