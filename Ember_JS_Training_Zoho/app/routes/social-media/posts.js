import Route from '@ember/routing/route';

export default class SocialMediaPostsRoute extends Route {
	model(data){
		const { pid } = data;
		
		return pid;
	}
}
