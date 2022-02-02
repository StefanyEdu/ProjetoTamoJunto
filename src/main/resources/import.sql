INSERT INTO public.events(
	id, eventtype, eventdatetime)
	VALUES (?, ?, ?);
	
	INSERT INTO public.user_event(
	users_id, events_id)
	VALUES (?, ?);
	
	INSERT INTO public.users(
	id, nikename, registration, date)
	VALUES (?, ?, ?, ?);